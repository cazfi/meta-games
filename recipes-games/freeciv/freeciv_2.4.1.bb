FREECIV_GUI = "gtk2"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "curl"

SRC_URI += "${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2"

EXTRA_OECONF += "--disable-mapimg"

SRC_URI[md5sum] = "9f280f320be0d597a29efe040f1b0025"
SRC_URI[sha256sum] = "e8074e4c14b69fc23d6956084524a5f42dbbe4620196ffa8b612135af35bef80"
