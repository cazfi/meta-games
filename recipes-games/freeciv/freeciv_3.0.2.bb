
require freeciv-qt5.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://dummy-qtver.patch \
"

SRC_URI[sha256sum] = "7407ea1a08267b1c5ee3439dc2db5c2d7b90ece7fcc3664ca2ad594435a57175"
