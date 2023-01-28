
require freeciv-qt5.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
file://allow-root.patch \
file://dummy-qtver-S2_6.patch \
"

SRC_URI[sha256sum] = "5a2476d11aea7712fdeaa6bb440b8396cf6cb74509b3f0b01947d3da180622be"
