DESCRIPTION = "GNOME Chess is a 2D chess game, where games can be played between a combination of human and computer players."
HOMEPAGE = "https://www.gnome.org/"
SECTION = "x11/application"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "libgames-support glib-2.0 gtk+3 librsvg libcanberra intltool-native itstool-native"

GNOME_COMPRESS_TYPE="xz"

inherit gnomebase gettext

SRC_URI[archive.md5sum] = "56eaa655a7989fd04ce0de3c66c2d8f8"
SRC_URI[archive.sha256sum] = "6c9647beb7579b0a8de4e73698d931b1d9ac2efab4e7d3649f482d2c68ebf8a3"

FILES_${PN} += "${libdir} ${datadir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
