
require freeciv-qt5.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "lua gtk4"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_1.patch \
"

SRC_URI[sha256sum] = "fd8872dbacc6cf0212a44c9e703a82bae71b0741a191ee318fbefd072a1ee431"

FREECIV_GUI += "gtk4"

PACKAGES += "${PN}-gtk4"

RDEPENDS:${PN}-gtk4 = "freeciv-common freeciv-client-common"
RPROVIDES:${PN}-gtk4 = "freeciv-client"
FILES:${PN}-gtk4 = "\
${bindir}/freeciv-gtk4 \
${datadir}/freeciv/themes/gtk4 \
"
