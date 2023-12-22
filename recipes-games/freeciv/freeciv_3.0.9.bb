
require freeciv-qt5.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root.patch \
file://dummy-qtver.patch \
file://0002-Reserve-space-for-terminating-NULL-on-astr_buffer.patch \
"

SRC_URI[sha256sum] = "16c46a9c378b4a511c1e3d3a7c435a78230a432d8b852202aaf5d5d584962742"
