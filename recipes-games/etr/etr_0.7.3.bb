SUMMARY = "High speed arctic racing game based on Tux Racer."
DESCRIPTION = " "

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SECTION = "games"

SRC_URI = " \
    http://sourceforge.net/projects/extremetuxracer/files/releases/${PV}/etr-${PV}.tar.xz \
    file://simple-configure.patch \
"

SRC_URI[md5sum] = "a3df8ddd106b2ef8e6a0492f28889e0a"
SRC_URI[sha256sum] = "9ed2c567fe296718523f4c3b2bb9531079dbfcaa486b3c4af552d70fe5f9e3d1"

DEPENDS = "sfml virtual/libgl libglu"

B = "${WORKDIR}/build"

inherit autotools
