DESCRIPTION = "GNOME Chess is a 2D chess game, where games can be played between a combination of human and computer players."
HOMEPAGE = "https://www.gnome.org/"
SECTION = "x11/application"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "libgames-support glib-2.0 gtk+3 librsvg libcanberra intltool-native itstool-native"

GNOME_COMPRESS_TYPE="xz"

inherit gnome gettext

SRC_URI[archive.md5sum] = "7c195495503ecdead1384e979beb6ec6"
SRC_URI[archive.sha256sum] = "dffdf7f5c5f4ea6bba7ff88b457a75ee5e4c5d9d522d27e1ea4a3d4bb3927792"

FILES_${PN} += "${libdir} ${datadir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
