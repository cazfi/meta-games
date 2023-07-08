
require freeciv-qt5.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root.patch \
file://dummy-qtver.patch \
"

SRC_URI[sha256sum] = "3b5aa32f628890be1741c3ac942cee82c79c065f8db6baff18d734a5c0e776d4"
