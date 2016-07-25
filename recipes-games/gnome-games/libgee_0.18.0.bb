DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures."
HOMEPAGE = "https://wiki.gnome.org/Projects/Libgee"
SECTION = "libs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"
DEPENDS = "gobject-introspection vala"

GNOME_COMPRESS_TYPE="xz"

inherit gnome

SRC_URI[archive.md5sum] = "29ea6125e653d7e60b49a9a9544abc96"
SRC_URI[archive.sha256sum] = "4ad99ef937d071b4883c061df40bfe233f7649d50c354cf81235f180b4244399"

FILES_${PN} += "${libdir} ${datadir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
