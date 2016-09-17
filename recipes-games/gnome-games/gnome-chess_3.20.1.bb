DESCRIPTION = "GNOME Chess is a 2D chess game, where games can be played between a combination of human and computer players."
HOMEPAGE = "https://www.gnome.org/"
SECTION = "x11/application"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "libgames-support glib-2.0 gtk+3 librsvg libcanberra intltool-native"

GNOME_COMPRESS_TYPE="xz"

inherit gnome

SRC_URI[archive.md5sum] = "2aa5f82ec7073b628b23e3df225dca28"
SRC_URI[archive.sha256sum] = "4715349339491bd7a1072d5d362b5df76efa2067f4363c4b37d9579201d8c66d"

FILES_${PN} += "${libdir} ${datadir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
