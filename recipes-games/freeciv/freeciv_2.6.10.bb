
require freeciv-qt5.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
file://allow-root.patch \
file://dummy-qtver-S2_6.patch \
"

SRC_URI[sha256sum] = "b7f5eb4cc99abeea1123614889f1432864014de4962839fabfa23fe4c64ad49d"
