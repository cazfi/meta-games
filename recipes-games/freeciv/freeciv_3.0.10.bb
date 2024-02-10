
require freeciv-qt5.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root.patch \
file://dummy-qtver.patch \
"

SRC_URI[sha256sum] = "c185c8ea0d6a2e974a5ad12fb837ca3ceb9aed3e7e884355f01035f5e779d23c"
