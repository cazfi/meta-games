
require freeciv-qt5.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "lua gtk4 zstd"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_1.patch \
"

SRC_URI[sha256sum] = "45fd8f8707029c84747a6c8dfa7ca7ac6a660fbe9a4e082f87cafc32e41eb51e"

FREECIV_GUI += "gtk4"

PACKAGES += "${PN}-gtk4"

RDEPENDS:${PN}-gtk4 = "freeciv-common freeciv-client-common"
RPROVIDES:${PN}-gtk4 = "freeciv-client"
FILES:${PN}-gtk4 = "\
${bindir}/freeciv-gtk4 \
${datadir}/freeciv/themes/gtk4 \
"
