
DESCRIPTION = "Games image to be used on USB stick (development image)"

IMAGE_LINGUAS = " "

LICENSE = "GPLv2"

inherit core-image image-vm

IMAGE_ROOTFS_SIZE = "8192"

IMAGE_FEATURES += "package-management x11-base x11-sato ssh-server-dropbear"

IMAGE_FSTYPES += "vmdk"

FREECIV = "\
 freeciv-server \
 freeciv-gtk2 \
 freeciv-gtk3 \
 freeciv-qt \
"

GNOME_GAMES = "\
 gnome-robots \
"

GAMELIST = "\
 packagegroup-core-x11-sato-games \
 ${GNOME_GAMES} \
 ${FREECIV} \
 etr \
 pingus \
"

TOOLS = "\
 nano \
 gdb \
 strace \
"

IMAGE_INSTALL += " \
packagegroup-core-boot \
${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL} \
${GAMELIST} \
${TOOLS} \
packagegroup-core-x11-sato-games \
"
