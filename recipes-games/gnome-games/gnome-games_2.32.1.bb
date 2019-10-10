DESCRIPTION = "GNOME Games is a collection of fifteen small games"
HOMEPAGE = "https://live.gnome.org/GnomeGames"
SECTION = "x11/application"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "glib-2.0 gtk+ cairo gstreamer librsvg python-pygtk libcanberra guile gnome-doc-utils"

GNOME_COMPRESS_TYPE="bz2"

inherit gnomebase python-dir

SRC_URI += " \
    file://0001-In-cross-environment-we-have-to-prepend-the-sysroot-.patch \
    file://0002-aisleriot-lib-Makefile.am-fix-configure.patch \
    file://0003-configure.in-fix-configure-with-quadrapassel-disable.patch \
    file://0004-aisleriot-game.c-fix-build-with-latest-guile.patch \
    file://0005-glchess-gnuchess-common.h-fix-compile-for-Werror-mis.patch \
"
SRC_URI[archive.md5sum] = "e5182bf7dc5d8573bdfdd4f5626890cd"
SRC_URI[archive.sha256sum] = "1a3b2e82102eed3780f05db4378111c475456678deed82fd4ca379da1c5593d9"

# don't build clutter depending games / pointer to python headers
EXTRA_OECONF += " \
    --enable-omitgames=quadrapassel,lightsoff,swell-foop,gnibbles \
    --disable-scrollkeeper \
"

# TDB: split packages?
FILES_${PN} += "${libdir} ${datadir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
