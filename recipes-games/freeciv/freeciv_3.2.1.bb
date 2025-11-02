
require freeciv-qt6.inc

DEPENDS += "lua"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.xz \
file://allow-root-S3_2.patch \
file://0019-Qt-Work-around-Qt-6.9-theming-issue.patch \
"

SRC_URI[sha256sum] = "3fc01ef55bfc9b9c2d71432d22a9fc5ab5892285d15d3dc888ec4bb288d21caa"
