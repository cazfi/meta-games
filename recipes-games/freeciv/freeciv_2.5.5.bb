FREECIV_GUI = "gtk2,gtk3,qt"

require freeciv.inc

EXTRA_OECONF += "\
--enable-sdl-mixer=sdl2 \
"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
"

SRC_URI[md5sum] = "0370ca429f634a72e5f821a2a44e2e77"
SRC_URI[sha256sum] = "5622f2142637057f7e47b1eda764c4e131222fab4d5bb42cd59fbd58ba3db1d4"
