
DESCRIPTION = "Games image to be used on USB stick"

IMAGE_LINGUAS = " "

LICENSE = "GPLv2"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"

IMAGE_FEATURES += "package-management x11-base x11-sato ssh-server-dropbear"

IMAGE_FSTYPES += "wic.vmdk"

FREECIV = "\
 freeciv-server \
 freeciv-gtk3.22 \
 freeciv-sdl2 \
 freeciv-qt \
"

GNOME_GAMES = "\
 gnome-chess \
 gnome-robots \
"

GAMELIST = "\
 packagegroup-core-x11-sato-games \
 ${GNOME_GAMES} \
 ${FREECIV} \
 etr \
 pingus \
"

IMAGE_INSTALL += " \
packagegroup-core-boot \
${CORE_IMAGE_EXTRA_INSTALL} \
${GAMELIST} \
"
