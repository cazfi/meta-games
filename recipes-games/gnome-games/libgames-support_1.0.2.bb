DESCRIPTION = "libgames-support is a small library intended for internal use by GNOME Games, \
but it may be used by others."
HOMEPAGE = "https://live.gnome.org/GnomeGames"
SECTION = "x11/application"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "glib-2.0 gtk+3 libgee intltool-native"

inherit gnomebase

SRC_URI[archive.md5sum] = "ffba5c102eeb9ae3d96294bccb02446e"
SRC_URI[archive.sha256sum] = "b096e8d8ddc57ff247edc5eae842d405402b043e289f3a0949499e1df514ba66"

FILES:${PN} += "${libdir} ${datadir}"
