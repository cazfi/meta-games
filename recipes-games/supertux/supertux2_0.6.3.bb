SUMMARY = "SuperTux is a classic 2D jump'n run sidescroller game"
DESCRIPTION = "SuperTux is a classic 2D jump'n run sidescroller game in a style similar to the original Super Mario games covered under the GPL"
HOMEAPAGE = "https://www.supertux.org/"
SECTION = "x11/application"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "boost libsdl2 libsdl2-image libvorbis curl openal-soft physfs glew freetype glm"

# somehow boost is not dragged in
RDEPENDS:${PN} += "boost"

inherit cmake pkgconfig gtk-icon-cache

# With Ninja it fails with:
# ninja: error: 'squirrel/lib/libsquirrel_static.a', needed by 'supertux2', missing and no known rule to make it
OECMAKE_GENERATOR = "Unix Makefiles"

SRC_URI = " \
    https://github.com/SuperTux/supertux/releases/download/v${PV}/SuperTux-v${PV}-Source.tar.gz \
    file://0001-CMakeLists.txt-Pin-PHYSFS_getPrefDir-autodetection-d.patch \
    file://0002-do-not-set-included-paths-as-system-causes-trouble-w.patch \
    file://0003-Set-DCMAKE_MAKE_PROGRAM-make-explicitly-for-external.patch \
    file://0004-Fix-missing-include-with-latest-glibc.patch \
"

SRC_URI[sha256sum] = "f7940e6009c40226eb34ebab8ffb0e3a894892d891a07b35d0e5762dd41c79f6"

S = "${WORKDIR}/SuperTux-v${PV}-Source"

EXTRA_OECMAKE = " \
    -DINSTALL_SUBDIR_BIN=bin \
    -DCMAKE_BUILD_TYPE=RELEASE \
    -DUSE_SYSTEM_PHYSFS=ON \
"

FILES:${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/games/supertux2 \
"
