SUMMARY = "in-depth comparison of files, archives, and directories"
HOMEPAGE = "https://diffoscope.org/"
LICENSE = "GPL-3.0+"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

PYPI_PACKAGE = "diffoscope"

inherit pypi setuptools3

SRC_URI[sha256sum] = "5b5fdaa4d900c891b319e4b9a006eb16824a0b61fdbe15e75acbbe35602e2da6"

RDEPENDS_${PN} += "binutils vim squashfs-tools python3-libarchive-c python3-magic"

# Dependencies don't build for musl
COMPATIBLE_HOST_libc-musl = 'null'

BBCLASSEXTEND = "native"
