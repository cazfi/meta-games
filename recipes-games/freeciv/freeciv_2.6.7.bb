
require freeciv-qt5.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
file://allow-root.patch \
file://dummy-qtver-S2_6.patch \
"

SRC_URI[sha256sum] = "efa7618024b05edee2b9b96614a2070deecb15da7d32e534b135f75fa824f2f7"
