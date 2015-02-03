DESCRIPTION = "SuperTuxKart is a kart racing game featuring Tux and his friends"
HOMEAPAGE = "http://supertuxkart.sourceforge.net"
SECTION = "x11/application"
LICENSE = "GPLv2 & GPLv3+ "
LIC_FILES_CHKSUM = "file://COPYING;md5=a71cb78659d60f2ced58a594cb65bfba"

DEPENDS = "libogg libvorbis libxrandr virtual/libgl openal-soft fribidi curl"

inherit cmake

S = "${WORKDIR}/SuperTuxKart-${PV}"

SRC_URI = "http://sourceforge.net/projects/supertuxkart/files/SuperTuxKart/${PV}/supertuxkart-${PV}-src.tar.bz2;protocol=https \
           file://0001-Use-system-s-glext.h-glxext.h-on-linux.patch  \
           file://0002-Applied-patch-from-jpirie-for-fixing-mesa-10-compila.patch"

SRC_URI[md5sum] = "aa31ecf883dc35859eec76c667f1a6d6"
SRC_URI[sha256sum] = "335301ae61b0c177be68d5593c65e5b197dc807421f08a8a35740a254cacf8d6"

