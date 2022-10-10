
require freeciv-qt5.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://dummy-qtver.patch \
"

SRC_URI[sha256sum] = "d9a83fe9268e6b9d0fbe933f1f8b5c391b7e3ad72333d2d4e35cfb2e3ce9adb9"
