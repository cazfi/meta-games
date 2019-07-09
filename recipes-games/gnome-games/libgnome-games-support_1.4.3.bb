DESCRIPTION = "libgnome-games-support is a small library intended for internal use by GNOME Games, \
but it may be used by others."
HOMEPAGE = "https://live.gnome.org/GnomeGames"
SECTION = "x11/application"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "gtk+3 libgee"

inherit gnomebase gettext

SRC_URI[archive.md5sum] = "a18acdf1a5398507a12fc6f408b5c541"
SRC_URI[archive.sha256sum] = "704a7a93aa5066f84738b60d696cf393dfbbf1a3e339f9adbb40af0cf70eca3c"

FILES_${PN} += "${libdir} ${datadir}"
