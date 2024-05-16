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

SRC_URI[sha256sum] = "fa3285cc0c755a5aff529f3f2cea3516481114c6b4b8e1ec0769feeff04773e5"

DEPENDS = "sfml virtual/libgl libglu"

B = "${WORKDIR}/build"

inherit autotools

do_install:append() {
        rm -Rf ${D}/${datadir}/metainfo
}
