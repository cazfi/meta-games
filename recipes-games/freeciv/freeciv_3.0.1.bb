
require freeciv-qt5.inc

DEFAULT_PREFERENCE = "-1"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://dummy-qtver.patch \
"

SRC_URI[sha256sum] = "beda7adaebb3462797c8f090ec604c2974f15a1559fff2fb4cfff2607cb0180f"
