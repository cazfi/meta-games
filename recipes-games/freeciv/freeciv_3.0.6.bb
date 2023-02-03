
require freeciv-qt5.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root.patch \
file://dummy-qtver.patch \
"

SRC_URI[sha256sum] = "40e701157b957a2eb3c4548e5b819d06521c2ad1d47ae926be5117c7d6ace442"
