DESCRIPTION = "SuperTuxKart is a kart racing game featuring Tux and his friends"
HOMEPAGE = "http://supertuxkart.sourceforge.net"
SECTION = "x11/application"
LICENSE = "GPLv2 & GPLv3+ & CC-BY-SA-3.0 & PD"
LIC_FILES_CHKSUM = "file://COPYING;md5=b0e65d539fc395f6c95b79063eab9bb3"

DEPENDS = " \
    libogg \
    libvorbis \
    libxrandr \
    virtual/libgles2 \
    openal-soft \
    fribidi \
    curl \
    libpng \
    libjpeg-turbo \
    freetype \
    bluez5 \
"

inherit cmake gtk-icon-cache features_check

REQUIRED_DISTRO_FEATURES = "x11"

SRC_URI = " \
    https://sourceforge.net/projects/supertuxkart/files/SuperTuxKart/${PV}/supertuxkart-${PV}-src.tar.xz \
"

SRC_URI[md5sum] = "8de5455b8fdbb92679e302b76c9041cf"
SRC_URI[sha256sum] = "d8014e7106ba84f98b5ec5f146249dcffc284fc4083f8f237ff420b9e2219cb0"

# Give BSP the chance to override GL
SELECTGL ??= "-DUSE_GLES2=ON"

EXTRA_OECMAKE = " \
    ${SELECTGL} \
"
PACKAGECONFIG ??= " \
    ${@bb.utils.filter('DISTRO_FEATURES', 'wayland', d)} \
"
PACKAGECONFIG[wayland] = "-DENABLE_WAYLAND_DEVICE=ON,-DENABLE_WAYLAND_DEVICE=OFF,wayland"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/appdata \
"
