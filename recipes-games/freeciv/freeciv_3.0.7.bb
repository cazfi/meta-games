
require freeciv-qt5.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root.patch \
file://dummy-qtver.patch \
"

SRC_URI[sha256sum] = "f6e606f17ed03d971272883f1a4879f5c1c2c247f64b8edefa6a25c8a2a8dac4"
