SUMMARY = "High speed arctic racing game based on Tux Racer."
DESCRIPTION = " "

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SECTION = "games"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/extremetuxracer/releases/${PV}/etr-${PV}.tar.xz \
    file://simple-configure.patch \
"

SRC_URI[sha256sum] = "1c874965e9e249533bf15c08dabc61e60c05bb3fd578917880117ff8a910cd4e"

DEPENDS = "sfml virtual/libgl libglu"

B = "${WORKDIR}/build"

inherit autotools

do_install:append() {
        rm -Rf ${D}/${datadir}/metainfo
}
