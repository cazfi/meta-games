DESCRIPTION = "SuperTuxKart is a kart racing game featuring Tux and his friends"
HOMEAPAGE = "http://supertuxkart.sourceforge.net"
SECTION = "x11/application"
LICENSE = "GPLv2 & GPLv3+ "
LIC_FILES_CHKSUM = "file://COPYING;md5=a71cb78659d60f2ced58a594cb65bfba"

DEPENDS = "libogg libvorbis libxrandr virtual/libgl openal-soft fribidi curl"

inherit cmake

S = "${WORKDIR}/supertuxkart-${PV}"

SRC_URI = "http://sourceforge.net/projects/supertuxkart/files/SuperTuxKart/${PV}/supertuxkart-${PV}-src.tar.xz;protocol=https \
"

SRC_URI[md5sum] = "f1f5081fd41b8eeb310b4edc07b9ee12"
SRC_URI[sha256sum] = "0b080bb098a26adb552d6fd48905bcb6b1e873ef1567457d7268d7d3aaa48282"

FILES-${PV} =+ "/usr/share/icons /usr/share/appdata"
