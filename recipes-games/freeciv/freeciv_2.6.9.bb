
require freeciv-qt5.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
file://allow-root.patch \
file://dummy-qtver-S2_6.patch \
"

SRC_URI[sha256sum] = "deb4ff4f43438f553413df8d847abb5270018155049b090976fcc835cb201ec6"
