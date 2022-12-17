
require freeciv-qt5.inc

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root.patch \
file://dummy-qtver.patch \
"

SRC_URI[sha256sum] = "4d2e22da54cf1e2821f78d0743ca25429c38dd7802414cd9e6090ad52f49ee83"
