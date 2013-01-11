DESCRIPTION = "SuperTux is a classic 2D jump'n run sidescroller game in a style similar to the original Super Mario games covered under the GPL"
HOMEAPAGE = "http://supertux.lethargik.org"
SECTION = "x11/application"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"
DEPENDS = "boost libsdl libsdl-image libvorbis curl openal-soft physfs glew"

# somehow boost is not dragged in
RDEPENDS_${PN} += "boost"

inherit cmake

SRCREV = "947098af8085388eef4b5352f5c5d0b6edbcd78a"
PV = "0.3.3+git${SRCPV}"
S = "${WORKDIR}/git"

SRC_URI = "git://code.google.com/p/supertux;protocol=https"
SRC_URI[md5sum] = "f3f803e629ee51a9de0b366a036e393d"
SRC_URI[sha256sum] = "fceaf95251092d5698211ff0f51f1c50237fa5e2a6690464e9835a66e18301d0"

EXTRA_OECMAKE = "-DINSTALL_SUBDIR_BIN=bin -DCMAKE_BUILD_TYPE=RELEASE"

do_install_append() {
	# Most of us don't have OpenGL. SDL in fullscreen seems to work best
	sed -i 's#Exec=supertux2#Exec=supertux2 --renderer sdl -f#' ${D}${datadir}/applications/supertux2.desktop
}

FILES_${PN} += "${datadir}/games/supertux2"
