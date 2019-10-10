DESCRIPTION = "gnome-robots is a small game"
HOMEPAGE = "https://www.gnome.org/"
SECTION = "x11/application"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "libgnome-games-support glib-2.0 gtk+3 librsvg libcanberra intltool-native itstool-native"

GNOME_COMPRESS_TYPE="xz"

inherit gnomebase

SRC_URI[archive.md5sum] = "adc8b1ddfff21e344eb461db0785eb08"
SRC_URI[archive.sha256sum] = "5cd4564d7eb876fe4ef332dc568bcf7b1515d8ec9f66e53c2bae5331e0182dd4"

FILES_${PN} += "${libdir} ${datadir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
