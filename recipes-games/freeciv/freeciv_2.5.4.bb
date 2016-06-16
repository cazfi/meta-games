FREECIV_GUI = "gtk2,gtk3,qt"

require freeciv.inc

EXTRA_OECONF += "\
--enable-sdl-mixer=sdl2 \
"

SRC_URI += "\
${SOURCEFORGE_MIRROR}/freeciv/freeciv-${PV}.tar.bz2 \
"

SRC_URI[md5sum] = "f2b2e1f0afc7daecc9050bf6ceadb1d8"
SRC_URI[sha256sum] = "9e64ef047fd0d2f8e9aa1da01586dea7cfe63a36b15875c168ada555c2e6634b"
