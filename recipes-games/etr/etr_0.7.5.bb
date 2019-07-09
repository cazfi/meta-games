SUMMARY = "High speed arctic racing game based on Tux Racer."
DESCRIPTION = " "

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SECTION = "games"

SRC_URI = " \
    http://sourceforge.net/projects/extremetuxracer/files/releases/${PV}/etr-${PV}.tar.xz \
    file://simple-configure.patch \
"

SRC_URI[md5sum] = "210a9aa0ac6e348b7f4e3141f383e5e0"
SRC_URI[sha256sum] = "4fd39c52a426ba22deb26bcceb807d7eebe7b7d7df578cfd03f10066c218c6d3"

DEPENDS = "sfml virtual/libgl libglu"

B = "${WORKDIR}/build"

inherit autotools

do_install_append() {
        rm -Rf ${D}/${datadir}/appdata
}
