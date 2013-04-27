FREECIV_GUI = "gtk2"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

PR = "r0"

DEPENDS += "curl"

SRC_URI += "${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2"

SRC_URI[md5sum] = "464553116e71dcafb1e768b5bfffdd39"
SRC_URI[sha256sum] = "3c8f2b7e29420090ee42c3ea590ec4c52bb1382e4a54c58245d17870eaf11b70"
