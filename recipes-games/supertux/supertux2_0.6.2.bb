SUMMARY = "SuperTux is a classic 2D jump'n run sidescroller game"
DESCRIPTION = "SuperTux is a classic 2D jump'n run sidescroller game in a style similar to the original Super Mario games covered under the GPL"
HOMEAPAGE = "http://supertux.lethargik.org"
SECTION = "x11/application"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "boost libsdl2 libsdl2-image libvorbis curl openal-soft physfs glew freetype"

# somehow boost is not dragged in
RDEPENDS_${PN} += "boost"

inherit cmake pkgconfig gtk-icon-cache

# With Ninja it fails with:
# ninja: error: 'squirrel/lib/libsquirrel_static.a', needed by 'supertux2', missing and no known rule to make it
OECMAKE_GENERATOR = "Unix Makefiles"

SRC_URI = " \
    https://github.com/SuperTux/supertux/releases/download/v${PV}/SuperTux-v${PV}-Source.tar.gz \
    file://0001-CMakeLists.txt-Pin-PHYSFS_getPrefDir-autodetection-d.patch \
    file://0002-do-not-set-included-paths-as-system-causes-trouble-w.patch \
    file://0003-Set-DCMAKE_MAKE_PROGRAM-make-explicitly-for-external.patch \
"
SRC_URI[md5sum] = "f05fb2f83e63cb099340668cfe314c2b"
SRC_URI[sha256sum] = "26a9e56ea2d284148849f3239177d777dda5b675a10ab2d76ee65854c91ff598"

S = "${WORKDIR}/SuperTux-v${PV}-Source"

EXTRA_OECMAKE = " \
    -DINSTALL_SUBDIR_BIN=bin \
    -DCMAKE_BUILD_TYPE=RELEASE \
    -DUSE_SYSTEM_PHYSFS=ON \
"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/games/supertux2 \
"
