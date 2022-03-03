
require freeciv-qt5.inc

DEFAULT_PREFERENCE = "-1"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://dummy-qtver.patch \
"

SRC_URI[sha256sum] = "ea2a8782d4fdfef2471e05b74569b4a69cc60a41ab279427860dafdac128a0b2"
