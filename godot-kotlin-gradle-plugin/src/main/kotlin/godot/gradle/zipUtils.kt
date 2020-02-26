package godot.gradle

import java.io.File
import java.io.InputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipException
import java.util.zip.ZipFile

fun unzip(zip: ZipFile, outputDir: File) {
  for (entry in zip.entries()) {
    unzipEntry(outputDir, entry, zip)
  }
}

private fun unzipEntry(outputDir: File, entry: ZipEntry, zip: ZipFile) {
  val outputDirCanonicalPath = outputDir.canonicalPath
  val output = outputDir.resolve(entry.name)
  if (!output.canonicalPath.startsWith(outputDirCanonicalPath)) {
    throw ZipException("Zip entry '${entry.name}' is outside of the output directory")
  }
  if (entry.isDirectory) {
    output.mkdirs()
  } else {
    output.parentFile.mkdirs()
    zip.getInputStream(entry).use { it.copyTo(output) }
  }
}

private fun InputStream.copyTo(file: File): Long =
  file.outputStream().use { copyTo(it) }