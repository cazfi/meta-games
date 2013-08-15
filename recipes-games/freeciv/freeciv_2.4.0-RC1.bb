FREECIV_GUI = "gtk2"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

PR = "r0"

DEPENDS += "curl"

SRC_URI += "${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2"

SRC_URI[md5sum] = "869d1cee74906bef0710c8f3bc8fa9ed"
SRC_URI[sha256sum] = "eb37d794d7474b2eb83d290e1a04b2a67864c21155aa17638d750e0143d30379"
