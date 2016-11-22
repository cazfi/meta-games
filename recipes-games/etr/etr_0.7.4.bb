SUMMARY = "High speed arctic racing game based on Tux Racer."
DESCRIPTION = " "

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SECTION = "games"

SRC_URI = " \
    http://sourceforge.net/projects/extremetuxracer/files/releases/${PV}/etr-${PV}.tar.xz \
    file://simple-configure.patch \
"

SRC_URI[md5sum] = "474b26c3642312c153587b59676b2e86"
SRC_URI[sha256sum] = "da9ce3a1b1e56415285163b9ebc67fdb11fca07acd3ab18f793556d996275234"

DEPENDS = "sfml virtual/libgl libglu"

B = "${WORKDIR}/build"

inherit autotools
