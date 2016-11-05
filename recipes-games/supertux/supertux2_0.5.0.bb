DESCRIPTION = "SuperTux is a classic 2D jump'n run sidescroller game in a style similar to the original Super Mario games covered under the GPL"
HOMEAPAGE = "http://supertux.lethargik.org"
SECTION = "x11/application"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "boost libsdl2 libsdl2-image libvorbis curl openal-soft physfs glew"

# somehow boost is not dragged in
RDEPENDS_${PN} += "boost"

inherit cmake

SRC_URI = " \
    https://github.com/SuperTux/supertux/releases/download/v${PV}/SuperTux-v${PV}-Source.tar.gz \
    file://0001-CMakeLists.txt-Pin-PHYSFS_getPrefDir-autodetection-d.patch \
    file://0002-CMakeLists.txt-force-ussage-of-supertux-s-version-of.patch \
    file://0003-pass-compile-flags-to-external-projects.patch \
    file://0004-do-not-set-included-paths-as-system-causes-trouble-w.patch \
"
SRC_URI[md5sum] = "3bb7c1f3f622da79ec9fe1ebc521f286"
SRC_URI[sha256sum] = "cfae0da40c41532fb414c3b17891c98396b59471fe583a8fc756b96aea61a73b"

S = "${WORKDIR}/SuperTux-v${PV}-Source"

EXTRA_OECMAKE = "-DINSTALL_SUBDIR_BIN=bin -DCMAKE_BUILD_TYPE=RELEASE"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/games/supertux2 \
"
