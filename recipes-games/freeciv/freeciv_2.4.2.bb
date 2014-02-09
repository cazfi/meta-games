FREECIV_GUI = "gtk2"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "curl"

SRC_URI += "${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2"

EXTRA_OECONF += "--disable-mapimg"

SRC_URI[md5sum] = "4bf03bbe7084d3e23739f1e5b2ccc529"
SRC_URI[sha256sum] = "025d3cf51237a0c12422a5f100460a22ce1236b650a1e73cbd1c13c0b0676ce0"
