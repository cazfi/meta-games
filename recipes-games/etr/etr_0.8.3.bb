SUMMARY = "High speed arctic racing game based on Tux Racer."
DESCRIPTION = " "
HOMEPAGE = "https://sourceforge.net/projects/extremetuxracer/"

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SECTION = "games"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/extremetuxracer/releases/${PV}/etr-${PV}.tar.xz \
    file://simple-configure.patch \
"

SRC_URI[sha256sum] = "2ee42f3f5fc2f8d49aa75056eb116f6cab84d6564120e6961ae5927367245113"

DEPENDS = "sfml virtual/libgl libglu"

B = "${WORKDIR}/build"

inherit autotools

do_install:append() {
        rm -Rf ${D}/${datadir}/metainfo
}
