
require freeciv-qt5.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://dummy-qtver.patch \
"

SRC_URI[sha256sum] = "13215adc96be9f2894d5f3a12c78b8ebb9ae06ecdab25fe6bb1794f6e6d2b61b"
