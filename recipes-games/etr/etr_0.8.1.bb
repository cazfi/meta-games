SUMMARY = "High speed arctic racing game based on Tux Racer."
DESCRIPTION = " "

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SECTION = "games"

SRC_URI = " \
    http://sourceforge.net/projects/extremetuxracer/files/releases/${PV}/etr-${PV}.tar.xz \
    file://simple-configure.patch \
"

SRC_URI[sha256sum] = "92da963ed32ab9bff126346edfb9549e871d7c3cec753f4ac5098e0d53c38341"

DEPENDS = "sfml virtual/libgl libglu"

B = "${WORKDIR}/build"

inherit autotools

do_install:append() {
        rm -Rf ${D}/${datadir}/appdata
}
