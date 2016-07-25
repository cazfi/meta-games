DESCRIPTION = "gnome-robots is a small game"
HOMEPAGE = "https://www.gnome.org/"
SECTION = "x11/application"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "libgames-support glib-2.0 gtk+3 librsvg libcanberra intltool-native"

GNOME_COMPRESS_TYPE="xz"

inherit gnome

SRC_URI[archive.md5sum] = "533b825799360d0e32b218273d7b3972"
SRC_URI[archive.sha256sum] = "d98f2ba5a7086e2dc3f3754819b557c12a98a0fb2492efd9912d9dd34ad9cfce"

FILES_${PN} += "${libdir} ${datadir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
