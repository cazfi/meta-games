DESCRIPTION = "libgnome-games-support is a small library intended for internal use by GNOME Games, \
but it may be used by others."
HOMEPAGE = "https://live.gnome.org/GnomeGames"
SECTION = "x11/application"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "gtk+3 libgee"

GNOME_COMPRESS_TYPE="xz"

inherit gnome gettext

SRC_URI[archive.md5sum] = "1bbbee6eee2f03c4649e32fa90c802f9"
SRC_URI[archive.sha256sum] = "a626396c72603add6bae1ab0b5bee1d58657cc7e232b1fe6fda746b960715ee7"

FILES_${PN} += "${libdir} ${datadir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
