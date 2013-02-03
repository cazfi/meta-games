require freeciv.inc

DEFAULT_PREFERENCE = "-1"

PR = "r0"

DEPENDS += "curl"

SRC_URI += "${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2"

SRC_URI[md5sum] = "178290b29a776f8f9da5309a2d379596"
SRC_URI[sha256sum] = "b20c0c0d6138e589b359be49546a034ca4f8deeba2c0b99a894333d306d2234b"
